import {Animal} from "./Animal";

class Parrot implements Animal {
    eat(): void {
        console.log("chewing ... swallowing ... chewing ... swallowing ... ");
    }

    fly(): void {
        console.log("Fly");
    }

    sleep(): void {
        console.log("ZzzzzzZzzzzzzzZzzzzz");
    }
}
