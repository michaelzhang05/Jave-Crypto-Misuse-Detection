package kotlin.reflect.x.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.calls.Caller;
import kotlin.reflect.x.internal.l0.l.e0;
import okhttp3.HttpUrl;

/* compiled from: KCallableImpl.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u00106\u001a\u00028\u00002\u0016\u00107\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010908\"\u0004\u0018\u000109H\u0016¢\u0006\u0002\u0010:J#\u0010;\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<H\u0002¢\u0006\u0002\u0010=J#\u0010>\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<H\u0016¢\u0006\u0002\u0010=J3\u0010?\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<2\f\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020,H\u0002J\n\u0010F\u001a\u0004\u0018\u00010GH\u0002R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \t*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000e0\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \t*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0014\u0010%\u001a\u00020#8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0012\u0010&\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u0016\u00102\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006H"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultEmptyArray", "type", "extractContinuationArgument", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* renamed from: f, reason: collision with root package name */
    private final c0.a<List<Annotation>> f19547f;

    /* renamed from: g, reason: collision with root package name */
    private final c0.a<ArrayList<KParameter>> f19548g;

    /* renamed from: h, reason: collision with root package name */
    private final c0.a<KTypeImpl> f19549h;

    /* renamed from: i, reason: collision with root package name */
    private final c0.a<List<KTypeParameterImpl>> f19550i;

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.f$a */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<List<? extends Annotation>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KCallableImpl<R> f19551f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f19551f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return i0.e(this.f19551f.D());
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.f$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<ArrayList<KParameter>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KCallableImpl<R> f19552f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.f$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<q0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w0 f19553f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w0 w0Var) {
                super(0);
                this.f19553f = w0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q0 invoke() {
                return this.f19553f;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0274b extends Lambda implements Function0<q0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w0 f19554f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0274b(w0 w0Var) {
                super(0);
                this.f19554f = w0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q0 invoke() {
                return this.f19554f;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.f$b$c */
        /* loaded from: classes2.dex */
        public static final class c extends Lambda implements Function0<q0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f19555f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f19556g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, int i2) {
                super(0);
                this.f19555f = bVar;
                this.f19556g = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q0 invoke() {
                i1 i1Var = this.f19555f.h().get(this.f19556g);
                l.e(i1Var, "descriptor.valueParameters[i]");
                return i1Var;
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.f$b$d */
        /* loaded from: classes2.dex */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int a;
                a = kotlin.comparisons.b.a(((KParameter) t).getName(), ((KParameter) t2).getName());
                return a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f19552f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList<KParameter> invoke() {
            int i2;
            kotlin.reflect.jvm.internal.impl.descriptors.b D = this.f19552f.D();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            int i3 = 0;
            if (this.f19552f.C()) {
                i2 = 0;
            } else {
                w0 i4 = i0.i(D);
                if (i4 != null) {
                    arrayList.add(new KParameterImpl(this.f19552f, 0, KParameter.a.INSTANCE, new a(i4)));
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                w0 m0 = D.m0();
                if (m0 != null) {
                    arrayList.add(new KParameterImpl(this.f19552f, i2, KParameter.a.EXTENSION_RECEIVER, new C0274b(m0)));
                    i2++;
                }
            }
            int size = D.h().size();
            while (i3 < size) {
                arrayList.add(new KParameterImpl(this.f19552f, i2, KParameter.a.VALUE, new c(D, i3)));
                i3++;
                i2++;
            }
            if (this.f19552f.B() && (D instanceof kotlin.reflect.x.internal.l0.d.a.k0.a) && arrayList.size() > 1) {
                x.x(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.f$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<KTypeImpl> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KCallableImpl<R> f19557f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.f$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<Type> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KCallableImpl<R> f19558f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(KCallableImpl<? extends R> kCallableImpl) {
                super(0);
                this.f19558f = kCallableImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type v = this.f19558f.v();
                return v == null ? this.f19558f.x().getF19658c() : v;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f19557f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KTypeImpl invoke() {
            e0 returnType = this.f19557f.D().getReturnType();
            l.c(returnType);
            return new KTypeImpl(returnType, new a(this.f19557f));
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.f$d */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KCallableImpl<R> f19559f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f19559f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeParameterImpl> invoke() {
            int t;
            List<e1> typeParameters = this.f19559f.D().getTypeParameters();
            l.e(typeParameters, "descriptor.typeParameters");
            KCallableImpl<R> kCallableImpl = this.f19559f;
            t = u.t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(t);
            for (e1 e1Var : typeParameters) {
                l.e(e1Var, "descriptor");
                arrayList.add(new KTypeParameterImpl(kCallableImpl, e1Var));
            }
            return arrayList;
        }
    }

    public KCallableImpl() {
        c0.a<List<Annotation>> d2 = c0.d(new a(this));
        l.e(d2, "lazySoft { descriptor.computeAnnotations() }");
        this.f19547f = d2;
        c0.a<ArrayList<KParameter>> d3 = c0.d(new b(this));
        l.e(d3, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f19548g = d3;
        c0.a<KTypeImpl> d4 = c0.d(new c(this));
        l.e(d4, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f19549h = d4;
        c0.a<List<KTypeParameterImpl>> d5 = c0.d(new d(this));
        l.e(d5, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f19550i = d5;
    }

    private final R s(Map<KParameter, ? extends Object> map) {
        int t;
        Object u;
        List<KParameter> parameters = getParameters();
        t = u.t(parameters, 10);
        ArrayList arrayList = new ArrayList(t);
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                u = map.get(kParameter);
                if (u == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.k()) {
                u = null;
            } else {
                if (!kParameter.g()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                u = u(kParameter.getType());
            }
            arrayList.add(u);
        }
        Caller<?> z = z();
        if (z != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return (R) z.call(array);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + D());
    }

    private final Object u(KType kType) {
        Class b2 = kotlin.jvm.a.b(kotlin.reflect.x.b.b(kType));
        if (b2.isArray()) {
            Object newInstance = Array.newInstance(b2.getComponentType(), 0);
            l.e(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + b2.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type v() {
        Type[] lowerBounds;
        kotlin.reflect.jvm.internal.impl.descriptors.b D = D();
        y yVar = D instanceof y ? (y) D : null;
        if (!(yVar != null && yVar.isSuspend())) {
            return null;
        }
        Object f0 = r.f0(x().a());
        ParameterizedType parameterizedType = f0 instanceof ParameterizedType ? (ParameterizedType) f0 : null;
        if (!l.a(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        l.e(actualTypeArguments, "continuationType.actualTypeArguments");
        Object M = j.M(actualTypeArguments);
        WildcardType wildcardType = M instanceof WildcardType ? (WildcardType) M : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) j.v(lowerBounds);
    }

    /* renamed from: A */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.b D();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        return l.a(getM(), "<init>") && getF19613k().a().isAnnotation();
    }

    public abstract boolean C();

    @Override // kotlin.reflect.KCallable
    public R call(Object... args) {
        l.f(args, "args");
        try {
            return (R) x().call(args);
        } catch (IllegalAccessException e2) {
            throw new IllegalCallableAccessException(e2);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(Map<KParameter, ? extends Object> args) {
        l.f(args, "args");
        return B() ? s(args) : t(args, null);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f19547f.invoke();
        l.e(invoke, "_annotations()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this.f19548g.invoke();
        l.e(invoke, "_parameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        KTypeImpl invoke = this.f19549h.invoke();
        l.e(invoke, "_returnType()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> invoke = this.f19550i.invoke();
        l.e(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = D().getVisibility();
        l.e(visibility, "descriptor.visibility");
        return i0.q(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return D().j() == d0.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return D().j() == d0.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return D().j() == d0.OPEN;
    }

    public final R t(Map<KParameter, ? extends Object> map, Continuation<?> continuation) {
        l.f(map, "args");
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it = parameters.iterator();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (continuation != null) {
                    arrayList.add(continuation);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i3));
                Caller<?> z2 = z();
                if (z2 != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(null);
                    try {
                        Object[] array2 = arrayList.toArray(new Object[0]);
                        l.d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        return (R) z2.call(array2);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalCallableAccessException(e2);
                    }
                }
                throw new KotlinReflectionInternalError("This callable does not support a default call: " + D());
            }
            KParameter next = it.next();
            if (i2 != 0 && i2 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i3));
                i3 = 0;
            }
            if (map.containsKey(next)) {
                arrayList.add(map.get(next));
            } else if (next.k()) {
                arrayList.add(i0.k(next.getType()) ? null : i0.g(kotlin.reflect.x.c.f(next.getType())));
                i3 = (1 << (i2 % 32)) | i3;
                z = true;
            } else if (next.g()) {
                arrayList.add(u(next.getType()));
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
            }
            if (next.getF21488i() == KParameter.a.VALUE) {
                i2++;
            }
        }
    }

    public abstract Caller<?> x();

    /* renamed from: y */
    public abstract KDeclarationContainerImpl getF19613k();

    public abstract Caller<?> z();
}
