package z3;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: a, reason: collision with root package name */
    private final List f10036a;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f10036a = list;
    }
}
