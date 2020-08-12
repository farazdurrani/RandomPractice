package random;

public class dontdelete {
    boolean backwardFound = false;
    boolean forwardFound = false;
    int backward = -1;
    int forward = -1;

    int j = 0;
    for (int i = k + 1; i < tools.size(); i++) {
        j++;
        if (tools.get(i).equals(q)) {
        forward = j;
        forwardFound = true;
        break;
        }
    }
    j = 0;
    for (int i = 0; i < k; i++) {
        j++;
        if (tools.get(i).equals(q)) {
        backward = j;
        backwardFound = true;
        break;
        }
    }

    if (forwardFound && backwardFound)
        return forward < backward ? forward : backward;

    else if (forwardFound)
        return forward;

    else if (backwardFound)
        return backward;
    else
        return -1;
}
