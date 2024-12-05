package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: ReflectJavaValueParameter.kt */
/* loaded from: classes2.dex */
public final class b0 extends p implements kotlin.reflect.x.internal.l0.d.a.n0.b0 {
    private final z a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f21824b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21825c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21826d;

    public b0(z zVar, Annotation[] annotationArr, String str, boolean z) {
        kotlin.jvm.internal.l.f(zVar, "type");
        kotlin.jvm.internal.l.f(annotationArr, "reflectAnnotations");
        this.a = zVar;
        this.f21824b = annotationArr;
        this.f21825c = str;
        this.f21826d = z;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public e e(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        return i.a(this.f21824b, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<e> getAnnotations() {
        return i.b(this.f21824b);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.b0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public z getType() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.b0
    public boolean g() {
        return this.f21826d;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.b0
    public kotlin.reflect.x.internal.l0.f.f getName() {
        String str = this.f21825c;
        if (str != null) {
            return kotlin.reflect.x.internal.l0.f.f.o(str);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0.class.getName());
        sb.append(": ");
        sb.append(g() ? "vararg " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
