package kotlin.reflect.x.internal.l0.m;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.m.g;
import kotlin.text.Regex;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class h {
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final Regex f21406b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<f> f21407c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<y, String> f21408d;

    /* renamed from: e, reason: collision with root package name */
    private final f[] f21409e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21410f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(y yVar) {
            l.f(yVar, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21411f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(y yVar) {
            l.f(yVar, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f21412f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(y yVar) {
            l.f(yVar, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(f fVar, Regex regex, Collection<f> collection, Function1<? super y, String> function1, f... fVarArr) {
        this.a = fVar;
        this.f21406b = regex;
        this.f21407c = collection;
        this.f21408d = function1;
        this.f21409e = fVarArr;
    }

    public final g a(y yVar) {
        l.f(yVar, "functionDescriptor");
        for (f fVar : this.f21409e) {
            String a2 = fVar.a(yVar);
            if (a2 != null) {
                return new g.b(a2);
            }
        }
        String invoke = this.f21408d.invoke(yVar);
        if (invoke != null) {
            return new g.b(invoke);
        }
        return g.c.f21405b;
    }

    public final boolean b(y yVar) {
        l.f(yVar, "functionDescriptor");
        if (this.a != null && !l.a(yVar.getName(), this.a)) {
            return false;
        }
        if (this.f21406b != null) {
            String f2 = yVar.getName().f();
            l.e(f2, "functionDescriptor.name.asString()");
            if (!this.f21406b.b(f2)) {
                return false;
            }
        }
        Collection<f> collection = this.f21407c;
        return collection == null || collection.contains(yVar.getName());
    }

    public /* synthetic */ h(f fVar, f[] fVarArr, Function1 function1, int i2, kotlin.jvm.internal.g gVar) {
        this(fVar, fVarArr, (Function1<? super y, String>) ((i2 & 4) != 0 ? a.f21410f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(f fVar, f[] fVarArr, Function1<? super y, String> function1) {
        this(fVar, (Regex) null, (Collection<f>) null, function1, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l.f(fVar, "name");
        l.f(fVarArr, "checks");
        l.f(function1, "additionalChecks");
    }

    public /* synthetic */ h(Regex regex, f[] fVarArr, Function1 function1, int i2, kotlin.jvm.internal.g gVar) {
        this(regex, fVarArr, (Function1<? super y, String>) ((i2 & 4) != 0 ? b.f21411f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Regex regex, f[] fVarArr, Function1<? super y, String> function1) {
        this((f) null, regex, (Collection<f>) null, function1, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l.f(regex, "regex");
        l.f(fVarArr, "checks");
        l.f(function1, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Function1 function1, int i2, kotlin.jvm.internal.g gVar) {
        this((Collection<f>) collection, fVarArr, (Function1<? super y, String>) ((i2 & 4) != 0 ? c.f21412f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection<f> collection, f[] fVarArr, Function1<? super y, String> function1) {
        this((f) null, (Regex) null, collection, function1, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l.f(collection, "nameList");
        l.f(fVarArr, "checks");
        l.f(function1, "additionalChecks");
    }
}
