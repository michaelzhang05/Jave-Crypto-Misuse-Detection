package kotlin.reflect.x.internal.l0.h;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.n;
import kotlin.jvm.internal.g;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public enum e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* renamed from: f, reason: collision with root package name */
    public static final a f20784f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Set<e> f20785g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set<e> f20786h;
    private final boolean x;

    /* compiled from: DescriptorRenderer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        Set<e> C0;
        Set<e> j0;
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.x) {
                arrayList.add(eVar);
            }
        }
        C0 = b0.C0(arrayList);
        f20785g = C0;
        j0 = n.j0(values());
        f20786h = j0;
    }

    e(boolean z) {
        this.x = z;
    }
}
