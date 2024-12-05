package K0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final List f5029a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f5030b;

    public j(int i8) {
        this.f5030b = i8;
    }

    public List a() {
        List b8 = b();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < b8.size(); i8++) {
            arrayList.add(((i) b8.get(i8)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f5029a));
    }

    public synchronized boolean c(List list) {
        this.f5029a.clear();
        if (list.size() > this.f5030b) {
            G0.h.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f5030b);
            return this.f5029a.addAll(list.subList(0, this.f5030b));
        }
        return this.f5029a.addAll(list);
    }
}
