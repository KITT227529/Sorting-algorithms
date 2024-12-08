class BubbleStringSort{

    public static void main(String[] args){

        String[] names = {"Konrád", "Bálint", "Hunor", "Davide", "Adrienn", "Eszter", "Anna", "Lia"};
        String temp;

        for(int i = 0; i < names.length; i++){

            for(int j = 0; j < names.length-1; j++){

                if(names[j].compareTo(names[j + 1]) > 0){
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}