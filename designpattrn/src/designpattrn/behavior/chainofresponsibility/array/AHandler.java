package designpattrn.behavior.chainofresponsibility.array;

public interface AHandler {

	boolean handleRequest(String user, double fee, StringBuilder result);
}
