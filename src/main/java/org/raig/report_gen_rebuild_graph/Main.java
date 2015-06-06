package org.raig.report_gen_rebuild_graph;

public class Main {
    public static final int OK = 1;
    public static final int ERROR_NO_ARGS = -1;

	public static void main(String[] args ) {	
		System.out.println("Generating report");
        int result = parseArgs(args);
        if ( result == ERROR_NO_ARGS) {
            System.out.println("ERROR: Bad Arguments");
            return;
        }
	}

    protected static int parseArgs(String[] args) {
        if ( args == null ) {
            return ERROR_NO_ARGS;
        }
        return OK;
    }
}
