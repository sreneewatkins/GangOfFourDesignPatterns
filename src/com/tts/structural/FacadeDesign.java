package com.tts.structural;

// https://www.geeksforgeeks.org/facade-design-pattern-introduction/

interface Hotel
{
    public Menus getMenus();
}

class NonVegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

class VegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        VegMenu v = new VegMenu();
        //v.theMenu = "This is the vegetarian menu from the VegRestaurant";
        return v;
    }
}

class VegNonBothRestaurant implements Hotel
{
    public Menus getMenus()
    {
        Both b = new Both();
        return b;
    }
}

class HotelKeeper
{
    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }

    public Both getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
    }
}

class RestaurantClient
{
    public static void main (String[] args)
    {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both b = keeper.getVegNonMenu();
        System.out.println(v.toString());
        System.out.println(nv.toString());
        System.out.println(b.toString());
    }
}

class Menus {
    public String theMenu = "generic menu";
}
class VegMenu extends Menus {
    public VegMenu() {
        theMenu = "This is the Vegetarian Menu";
    }

    @Override
    public String toString() {
        return "VegMenu{" +
                " theMenu='" + theMenu + '\'' +
                '}';
    }
}
class NonVegMenu extends Menus {
    public NonVegMenu() {
        theMenu = "This is the Non-Vegetarian Menu";
    }

    @Override
    public String toString() {
        return "NonVegMenu{" +
                " theMenu='" + theMenu + '\'' +
                '}';
    }
}
class Both extends Menus {
    public Both() {
        theMenu = "This is both veg and non-veg menu";
    }

    @Override
    public String toString() {
        return "Both{" +
                " theMenu='" + theMenu + '\'' +
                '}';
    }
}

/*
The following example casts an instance of the class VicePresident to an
instance of the class Employee; VicePresident is a subclass of Employee
with more information, which here defines that the VicePresident has
executive washroom privileges:

Employee emp = new Employee();
VicePresident veep = new VicePresident();
emp = veep; // no cast needed for upward use
veep = (VicePresident)emp; // must cast explicitly
 */
