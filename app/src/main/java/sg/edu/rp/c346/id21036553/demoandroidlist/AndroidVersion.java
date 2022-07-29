package sg.edu.rp.c346.id21036553.demoandroidlist;

public class AndroidVersion {

    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return  name + "\n " + version;
    }

}
