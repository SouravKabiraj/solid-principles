import {Animal} from "./Animal";

class Dog implements Animal {
    eat(): void {
        console.log("chewing ... swallowing ... chewing ... swallowing ... ");
    }

    fly(): void {
        throw new Error();
    }

    sleep(): void {
        console.log("ZzzzzzZzzzzzzzZzzzzz");
    }
}
