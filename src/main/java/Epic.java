public class Epic extends Task {
    protected static String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        Epic.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks) {
            if (subtasks.contains(query)) {
                return true;
            }
        }
        return false;
    }
}