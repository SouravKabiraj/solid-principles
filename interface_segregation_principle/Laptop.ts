import {Computer} from "./Computer";

class Laptop implements Computer {
    compute(): void {
        console.log("compute");
    }

    handleInput(): void {
        console.log("taking inputs..");
    }

    showOutput(): void {
        console.log("showing output...");
    }
}
