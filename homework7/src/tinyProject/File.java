package tinyProject;

import java.util.ArrayList;
import java.util.List;

public class File {
    private final String fileAddress;

    public File(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public List<Employee> parseData() {
        return new ArrayList<>();
    }

    public void loadData(List<Employee> data) {
    }
}
