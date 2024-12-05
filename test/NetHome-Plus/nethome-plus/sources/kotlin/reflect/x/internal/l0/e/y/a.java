package kotlin.reflect.x.internal.l0.e.y;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntRange;

/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.reflect.x.internal.l0.e.z.a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0327a f20673g = new C0327a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f20674h = new a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    public static final a f20675i = new a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: kotlin.f0.x.e.l0.e.y.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0327a {
        private C0327a() {
        }

        public /* synthetic */ C0327a(g gVar) {
            this();
        }

        public final a a(InputStream inputStream) {
            int t;
            int[] x0;
            l.f(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            t = u.t(intRange, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            x0 = b0.x0(arrayList);
            return new a(Arrays.copyOf(x0, x0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.f(iArr, "numbers");
    }

    public boolean h() {
        return f(f20674h);
    }
}
