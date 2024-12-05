package p0;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class s extends o0.a {

    /* renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f8743a;

    /* loaded from: classes.dex */
    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f8744a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f8744a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new s(this.f8744a);
        }
    }

    public s(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f8743a = jsReplyProxyBoundaryInterface;
    }

    public static s b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) q5.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (s) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // o0.a
    public void a(String str) {
        if (!x.U.d()) {
            throw x.a();
        }
        this.f8743a.postMessage(str);
    }
}
