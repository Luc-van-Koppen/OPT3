import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WasmachineTest {
    //arrange
    private Wasmachine wasm1, wasm2;
    private Wasprogramma wp1, wp2, wp3;
    @BeforeEach
    void setUp() {
        wasm1 = new Wasmachine(1, "Keuken");
        wasm2 = new Wasmachine(2, "Badkamer");
        wp1 = new Wasprogramma(120, true, false, false, "wasprogramma", "wasprogramma1");
        wp2 = new Wasprogramma(90, false, true, false, "wasprogramma", "wasprogramma2");
        wp3 = new Wasprogramma(60, false, false, true, "wasprogramma", "wasprogramma3");
        wasm1.addWasprogramma(wp1);
        wasm1.addWasprogramma(wp2);
        wasm2.addWasprogramma(wp3);
    }

    @Test
    void checkBeschikbaarheid() {
        // Testen of een beschikbare wasmachine wordt geretourneerd
        Wasmachine wasmachine = Wasmachine.CheckBeschikbaarheid(false, false, false);
        assertNull(wasmachine);
        wasmachine = Wasmachine.CheckBeschikbaarheid(true, false, false);
        assertNotNull(wasmachine);
        // Testen of er null wordt geretourneerd als er geen beschikbare wasmachines zijn
        wasm1.updateWasmachineStatus(false);
        wasm2.updateWasmachineStatus(false);
        wasmachine = Wasmachine.CheckBeschikbaarheid(false, false, false);
        assertNull(wasmachine);
        // Testen of een wasmachine wordt geretourneerd die het juiste wasprogramma kan uitvoeren
        wasm1.updateWasmachineStatus(true);
        wasmachine = Wasmachine.CheckBeschikbaarheid(true, false, false);
        assertEquals(wasmachine, wasm1);
    }

    @Test
    void startWasmachine() {
        // Testen of een bon wordt geretourneerd
        Bon bon = wasm1.startWasmachine(wp1);
        assertNotNull(bon);
        assertEquals(wp1, bon.getWasprogramma());
        assertEquals(wasm1, bon.getWasmachine());
    }

    @Test
    void updateWasmachineStatus() {
        // Testen of de beschikbaarheid van de wasmachine correct wordt geüpdatet
        wasm1.updateWasmachineStatus(false);
        assertFalse(wasm1.getBeschikbaar());
        wasm1.updateWasmachineStatus(true);
        assertTrue(wasm1.getBeschikbaar());
    }

}