package m5;

import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private int f7913a = 0;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray f7914b = new SparseArray();

    public synchronized Pair a(int i6) {
        Pair pair;
        pair = (Pair) this.f7914b.get(i6);
        this.f7914b.remove(i6);
        return pair;
    }

    public synchronized int b(org.apache.cordova.b bVar, int i6) {
        int i7;
        i7 = this.f7913a;
        this.f7913a = i7 + 1;
        this.f7914b.put(i7, new Pair(bVar, Integer.valueOf(i6)));
        return i7;
    }
}
