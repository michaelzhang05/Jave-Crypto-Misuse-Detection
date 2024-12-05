package B0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class s extends t {

    /* renamed from: a, reason: collision with root package name */
    private final List f655a;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f655a = list;
    }
}
