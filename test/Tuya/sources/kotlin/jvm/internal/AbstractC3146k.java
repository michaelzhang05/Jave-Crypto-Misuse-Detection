package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.InterfaceC2644d;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3146k implements InterfaceC2642b, Serializable {
    public static final Object NO_RECEIVER = a.f33779a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2642b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.k$a */
    /* loaded from: classes5.dex */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final a f33779a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3146k(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }

    @Override // e6.InterfaceC2642b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // e6.InterfaceC2642b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2642b compute() {
        InterfaceC2642b interfaceC2642b = this.reflected;
        if (interfaceC2642b == null) {
            InterfaceC2642b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC2642b;
    }

    protected abstract InterfaceC2642b computeReflected();

    @Override // e6.InterfaceC2641a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // e6.InterfaceC2642b
    public String getName() {
        return this.name;
    }

    public InterfaceC2644d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return U.c(cls);
        }
        return U.b(cls);
    }

    @Override // e6.InterfaceC2642b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC2642b getReflected() {
        InterfaceC2642b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new W5.b();
    }

    @Override // e6.InterfaceC2642b
    public e6.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // e6.InterfaceC2642b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // e6.InterfaceC2642b
    public e6.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // e6.InterfaceC2642b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // e6.InterfaceC2642b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // e6.InterfaceC2642b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // e6.InterfaceC2642b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
