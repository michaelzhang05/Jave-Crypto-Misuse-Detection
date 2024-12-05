package kotlin.reflect.x.internal;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import okhttp3.HttpUrl;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "appendReceiverType", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.e0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ReflectionObjectRenderer {
    public static final ReflectionObjectRenderer a = new ReflectionObjectRenderer();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.h.c f19544b = kotlin.reflect.x.internal.l0.h.c.f20761g;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KParameter.a.values().length];
            iArr[KParameter.a.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.a.INSTANCE.ordinal()] = 2;
            iArr[KParameter.a.VALUE.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e0$b */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<i1, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19545f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i1 i1Var) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.a;
            e0 type = i1Var.getType();
            l.e(type, "it.type");
            return reflectionObjectRenderer.h(type);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e0$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<i1, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f19546f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i1 i1Var) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.a;
            e0 type = i1Var.getType();
            l.e(type, "it.type");
            return reflectionObjectRenderer.h(type);
        }
    }

    private ReflectionObjectRenderer() {
    }

    private final void a(StringBuilder sb, w0 w0Var) {
        if (w0Var != null) {
            e0 type = w0Var.getType();
            l.e(type, "receiver.type");
            sb.append(h(type));
            sb.append(".");
        }
    }

    private final void b(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        w0 i2 = i0.i(aVar);
        w0 m0 = aVar.m0();
        a(sb, i2);
        boolean z = (i2 == null || m0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        a(sb, m0);
        if (z) {
            sb.append(")");
        }
    }

    private final String c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        if (aVar instanceof t0) {
            return g((t0) aVar);
        }
        if (aVar instanceof y) {
            return d((y) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    public final String d(y yVar) {
        l.f(yVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = a;
        reflectionObjectRenderer.b(sb, yVar);
        kotlin.reflect.x.internal.l0.h.c cVar = f19544b;
        f name = yVar.getName();
        l.e(name, "descriptor.name");
        sb.append(cVar.v(name, true));
        List<i1> h2 = yVar.h();
        l.e(h2, "descriptor.valueParameters");
        b0.Z(h2, sb, ", ", "(", ")", 0, null, b.f19545f, 48, null);
        sb.append(": ");
        e0 returnType = yVar.getReturnType();
        l.c(returnType);
        sb.append(reflectionObjectRenderer.h(returnType));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String e(y yVar) {
        l.f(yVar, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = a;
        reflectionObjectRenderer.b(sb, yVar);
        List<i1> h2 = yVar.h();
        l.e(h2, "invoke.valueParameters");
        b0.Z(h2, sb, ", ", "(", ")", 0, null, c.f19546f, 48, null);
        sb.append(" -> ");
        e0 returnType = yVar.getReturnType();
        l.c(returnType);
        sb.append(reflectionObjectRenderer.h(returnType));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String f(KParameterImpl kParameterImpl) {
        l.f(kParameterImpl, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        StringBuilder sb = new StringBuilder();
        int i2 = a.a[kParameterImpl.getF21488i().ordinal()];
        if (i2 == 1) {
            sb.append("extension receiver parameter");
        } else if (i2 == 2) {
            sb.append("instance parameter");
        } else if (i2 == 3) {
            sb.append("parameter #" + kParameterImpl.getF21487h() + ' ' + kParameterImpl.getName());
        }
        sb.append(" of ");
        sb.append(a.c(kParameterImpl.c().D()));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String g(t0 t0Var) {
        l.f(t0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(t0Var.j0() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = a;
        reflectionObjectRenderer.b(sb, t0Var);
        kotlin.reflect.x.internal.l0.h.c cVar = f19544b;
        f name = t0Var.getName();
        l.e(name, "descriptor.name");
        sb.append(cVar.v(name, true));
        sb.append(": ");
        e0 type = t0Var.getType();
        l.e(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.h(type));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String h(e0 e0Var) {
        l.f(e0Var, "type");
        return f19544b.w(e0Var);
    }
}
