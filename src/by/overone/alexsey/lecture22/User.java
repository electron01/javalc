package by.overone.alexsey.lecture22;

public class User implements Iterable {
    private String name;
    private String[] skills;

    @Override
    public UserIterator getUserIterator(){
        return new UserIteratorImpl();
    }

    public User(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
   private class UserIteratorImpl implements UserIterator{
        private int count=0;


       @Override
       public boolean hasNext(){
           if(count<skills.length){
               return true;
           }
           return false;
       }

       @Override
       public String next(){
           return skills[count++];

                //тоже самое
//            String str = skills[count];
//            count=count+1;
//            return str;

       }
   }


}
