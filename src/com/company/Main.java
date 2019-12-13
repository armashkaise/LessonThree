package com.company;

public class Main {

    public static void main(String[] args) {
        Account someAccount = new Account(50, "Available");
        PremiunAccount someMan = new PremiunAccount(1_000, "Busy", 10_000);
        if (transaction(someAccount, someMan, 10)){
            System.out.println(someAccount.getBalans());
            System.out.println(someMan.getBalans());
        }

        //п.2 домашнего задания
        System.out.println("-----------------п.2 домашнего задания---------------------");
        User user = new User("User1", "123");
        Profile profile = new Profile("abrakadabra", user);

        System.out.println(profile.getInfoAboutProfile());

        //п.3 домашнего задания
        System.out.println("-----------------п.3 домашнего задания---------------------");
        Profile profile1 = new Profile();
        profile1.setLogin("User1");
        profile1.setUser(user);

        System.out.println(profile.getInfoAboutProfile());

        System.out.println(comparison(profile, profile1));

        profile = profile1;

        System.out.println(comparison(profile, profile1));


    }

    public static String comparison(Profile profile, Profile profile1){
        if (profile == profile1) return "Объекты " + profile + " и " + profile1 +  " равны, т.к. ссылаются на один и тот же объект";
        return "Объекты " + profile + " и " + profile1 +  " ссылаются на разные участки памяти, выделенные для создания объектов, т.е. это разные объекты";
    }

    private static boolean transaction(Account from, Account to, int amount){
        if (from.decreaseBalans(amount) && to.increaseBalans(amount)) return true;
        return false;
    }

}
