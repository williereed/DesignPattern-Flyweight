package flyweight;

// A client needs a flyweight object; it calls the factory to get the flyweight object.
// The factory checks a pool of flyweights to determine if a flyweight object of the requested type is in the pool,
// if there is, the reference to that object is returned. If there is no object of the required type,
// the factory creates a flyweight of the requested type, adds it to the pool, and returns a reference to the flyweight.
// The flyweight maintains intrinsic state (state that is shared among the large number of objects that we have created
// the flyweight for) and provides methods to manipulate external state (State that vary from object to object and is
// not common among the objects we have created the flyweight for).

// this example shows multiple SoldierClient objects sharing data (soldierGraphicalRepresentation)
// and each object having its own unique data (currentLocationX and currentLocationY)

public class Main {

    public static void main(String[] args) {
        SoldierClient warSoldiers [] ={
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient()
        };

        // move each soldier to his location, take user input to move each soldier
        warSoldiers[0].moveSoldier(17, 2112);

        // 	take user input to move each soldier
        warSoldiers[1].moveSoldier(137, 112);

        // note that there is only one SoldierImp ( flyweight Imp)
        // for all the 5 soldiers
        // Soldier Client size is small due to the small state it maintains
        // SoliderImp size might be large or might be small
        // however we saved memory costs of creating 5 Soldier representations
    }
}
