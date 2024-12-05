package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.InterfaceC2964d;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3242k implements InterfaceC2962b, Serializable {
    public static final Object NO_RECEIVER = a.f34180a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2962b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.k$a */
    /* loaded from: classes5.dex */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final a f34180a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3242k(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }

    @Override // h6.InterfaceC2962b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // h6.InterfaceC2962b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2962b compute() {
        InterfaceC2962b interfaceC2962b = this.reflected;
        if (interfaceC2962b == null) {
            InterfaceC2962b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC2962b;
    }

    protected abstract InterfaceC2962b computeReflected();

    @Override // h6.InterfaceC2961a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // h6.InterfaceC2962b
    public String getName() {
        return this.name;
    }

    public InterfaceC2964d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return U.c(cls);
        }
        return U.b(cls);
    }

    @Override // h6.InterfaceC2962b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC2962b getReflected() {
        InterfaceC2962b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new Z5.b();
    }

    @Override // h6.InterfaceC2962b
    public h6.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // h6.InterfaceC2962b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // h6.InterfaceC2962b
    public h6.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // h6.InterfaceC2962b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // h6.InterfaceC2962b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // h6.InterfaceC2962b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // h6.InterfaceC2962b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
