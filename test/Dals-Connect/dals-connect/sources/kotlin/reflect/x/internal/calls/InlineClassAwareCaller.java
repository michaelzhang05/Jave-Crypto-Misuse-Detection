package kotlin.reflect.x.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntRange;
import kotlin.reflect.x.internal.i0;
import okhttp3.HttpUrl;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.k0.g, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {
    private final Caller<M> a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19653b;

    /* renamed from: c, reason: collision with root package name */
    private final a f19654c;

    /* compiled from: InlineClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", HttpUrl.FRAGMENT_ENCODE_SET, "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.k0.g$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private final IntRange a;

        /* renamed from: b, reason: collision with root package name */
        private final Method[] f19655b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f19656c;

        public a(IntRange intRange, Method[] methodArr, Method method) {
            l.f(intRange, "argumentRange");
            l.f(methodArr, "unbox");
            this.a = intRange;
            this.f19655b = methodArr;
            this.f19656c = method;
        }

        /* renamed from: a, reason: from getter */
        public final IntRange getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final Method[] getF19655b() {
            return this.f19655b;
        }

        /* renamed from: c, reason: from getter */
        public final Method getF19656c() {
            return this.f19656c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((r12 instanceof kotlin.reflect.x.internal.calls.BoundCaller) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InlineClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.b r11, kotlin.reflect.x.internal.calls.Caller<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.calls.InlineClassAwareCaller.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.f0.x.e.k0.d, boolean):void");
    }

    @Override // kotlin.reflect.x.internal.calls.Caller
    public List<Type> a() {
        return this.a.a();
    }

    @Override // kotlin.reflect.x.internal.calls.Caller
    public Object call(Object[] args) {
        Object invoke;
        l.f(args, "args");
        a aVar = this.f19654c;
        IntRange a2 = aVar.getA();
        Method[] f19655b = aVar.getF19655b();
        Method f19656c = aVar.getF19656c();
        Object[] copyOf = Arrays.copyOf(args, args.length);
        l.e(copyOf, "copyOf(this, size)");
        l.d(copyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int f19489g = a2.getF19489g();
        int f19490h = a2.getF19490h();
        if (f19489g <= f19490h) {
            while (true) {
                Method method = f19655b[f19489g];
                Object obj = args[f19489g];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        l.e(returnType, "method.returnType");
                        obj = i0.g(returnType);
                    }
                }
                copyOf[f19489g] = obj;
                if (f19489g == f19490h) {
                    break;
                }
                f19489g++;
            }
        }
        Object call = this.a.call(copyOf);
        return (f19656c == null || (invoke = f19656c.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // kotlin.reflect.x.internal.calls.Caller
    public M getMember() {
        return this.a.getMember();
    }

    @Override // kotlin.reflect.x.internal.calls.Caller
    /* renamed from: getReturnType */
    public Type getF19658c() {
        return this.a.getF19658c();
    }
}
