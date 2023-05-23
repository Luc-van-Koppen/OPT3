public interface WasmachineService {
        Bon startWasmachine(Wasprogramma wasprogramma);

        // voer wasprogramma uit
        // is er een machine die dit programma kan draaien beschikbaar
        public void updateWasmachineStatus(boolean beschikbaar);
        // stel wasmachine wel of niet beschikbaar.
}
