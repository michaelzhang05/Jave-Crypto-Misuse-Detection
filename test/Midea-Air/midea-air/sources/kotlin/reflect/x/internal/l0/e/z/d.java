package kotlin.reflect.x.internal.l0.e.z;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.o;
import kotlin.reflect.x.internal.l0.e.p;

/* compiled from: NameResolverImpl.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    private final p a;

    /* renamed from: b, reason: collision with root package name */
    private final o f20703b;

    /* compiled from: NameResolverImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o.c.EnumC0325c.values().length];
            iArr[o.c.EnumC0325c.CLASS.ordinal()] = 1;
            iArr[o.c.EnumC0325c.PACKAGE.ordinal()] = 2;
            iArr[o.c.EnumC0325c.LOCAL.ordinal()] = 3;
            a = iArr;
        }
    }

    public d(p pVar, o oVar) {
        l.f(pVar, "strings");
        l.f(oVar, "qualifiedNames");
        this.a = pVar;
        this.f20703b = oVar;
    }

    private final Triple<List<String>, List<String>, Boolean> c(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i2 != -1) {
            o.c v = this.f20703b.v(i2);
            String v2 = this.a.v(v.B());
            o.c.EnumC0325c z2 = v.z();
            l.c(z2);
            int i3 = a.a[z2.ordinal()];
            if (i3 == 1) {
                linkedList2.addFirst(v2);
            } else if (i3 == 2) {
                linkedList.addFirst(v2);
            } else if (i3 == 3) {
                linkedList2.addFirst(v2);
                z = true;
            }
            i2 = v.A();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public String a(int i2) {
        String b0;
        String b02;
        Triple<List<String>, List<String>, Boolean> c2 = c(i2);
        List<String> a2 = c2.a();
        b0 = b0.b0(c2.b(), ".", null, null, 0, null, null, 62, null);
        if (a2.isEmpty()) {
            return b0;
        }
        StringBuilder sb = new StringBuilder();
        b02 = b0.b0(a2, "/", null, null, 0, null, null, 62, null);
        sb.append(b02);
        sb.append('/');
        sb.append(b0);
        return sb.toString();
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public boolean b(int i2) {
        return c(i2).d().booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.e.z.c
    public String getString(int i2) {
        String v = this.a.v(i2);
        l.e(v, "strings.getString(index)");
        return v;
    }
}
