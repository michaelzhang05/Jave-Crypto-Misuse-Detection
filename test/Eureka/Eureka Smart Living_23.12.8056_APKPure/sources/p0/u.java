package p0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public abstract class u implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8748a = {"WEB_MESSAGE_GET_MESSAGE_PAYLOAD"};

    private static o0.d[] a(InvocationHandler[] invocationHandlerArr) {
        o0.d[] dVarArr = new o0.d[invocationHandlerArr.length];
        for (int i6 = 0; i6 < invocationHandlerArr.length; i6++) {
            dVarArr[i6] = new w(invocationHandlerArr[i6]);
        }
        return dVarArr;
    }

    public static o0.c b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        o0.d[] a6 = a(webMessageBoundaryInterface.getPorts());
        if (!x.C.d()) {
            return new o0.c(webMessageBoundaryInterface.getData(), a6);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) q5.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new o0.c(webMessagePayloadBoundaryInterface.getAsString(), a6);
        }
        if (type != 1) {
            return null;
        }
        return new o0.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a6);
    }
}
