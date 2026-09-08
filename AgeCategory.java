class AgeCategory{
    public static void main(String[] args){
        int age = 25;
        if(age < 13){
            System.out.println("Child");
        }else if(age >= 13 && age < 20){
            System.out.println("Teenager");
        }else if(age >= 20 && age < 65){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}