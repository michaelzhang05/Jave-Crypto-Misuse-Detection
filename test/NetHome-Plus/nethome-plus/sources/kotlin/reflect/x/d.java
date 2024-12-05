package kotlin.reflect.x;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.EmptyContainerForLocal;
import kotlin.reflect.x.internal.KFunctionImpl;
import kotlin.reflect.x.internal.i0;
import kotlin.reflect.x.internal.l0.e.a0.b.e;
import kotlin.reflect.x.internal.l0.e.a0.b.f;
import kotlin.reflect.x.internal.l0.e.t;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.j.b.w;

/* compiled from: reflectLambda.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    /* compiled from: reflectLambda.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    /* synthetic */ class a extends i implements Function2<w, kotlin.reflect.x.internal.l0.e.i, y0> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f19525h = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(w.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final y0 invoke(w wVar, kotlin.reflect.x.internal.l0.e.i iVar) {
            l.f(wVar, "p0");
            l.f(iVar, "p1");
            return wVar.j(iVar);
        }
    }

    public static final <R> KFunction<R> a(Function<? extends R> function) {
        l.f(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        Pair<f, kotlin.reflect.x.internal.l0.e.i> j2 = kotlin.reflect.x.internal.l0.e.a0.b.i.j(d1, metadata.d2());
        f a2 = j2.a();
        kotlin.reflect.x.internal.l0.e.i b2 = j2.b();
        e eVar = new e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = function.getClass();
        t o0 = b2.o0();
        l.e(o0, "proto.typeTable");
        return new KFunctionImpl(EmptyContainerForLocal.f19526i, (y0) i0.h(cls, b2, a2, new g(o0), eVar, a.f19525h));
    }
}
