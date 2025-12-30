//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    WheelLock lock = new WheelLock(new char[]{'J', 'R', 'B'}, new char[]{'U', 'O', 'A'}, new char[]{'S', 'R', 'T'}, new char[]{'T', 'E', 'S'});
    System.out.println(lock.getCurrentValue());
    lock.rotateWheel(0);
    System.out.println(lock.getCurrentValue());
    lock.rotateWheel(0);
    System.out.println(lock.getCurrentValue());
}
