package mainPackage;

public class ProxyExternalSystem {
    private final ExternalSystem externalSystem;

    public ProxyExternalSystem(ExternalSystem externalSystem) {
        this.externalSystem = externalSystem;
    }

    public void handleData(Data data) {
        synchronized (data.getCode().intern()){
            externalSystem.process(data);
        }
    }
}
