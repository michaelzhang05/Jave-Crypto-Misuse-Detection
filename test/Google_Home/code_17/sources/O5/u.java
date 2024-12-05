package O5;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u implements InterfaceC1355k, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8305d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8306e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* renamed from: a, reason: collision with root package name */
    private volatile Function0 f8307a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f8308b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8309c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public u(Function0 initializer) {
        AbstractC3255y.i(initializer, "initializer");
        this.f8307a = initializer;
        E e8 = E.f8272a;
        this.f8308b = e8;
        this.f8309c = e8;
    }

    @Override // O5.InterfaceC1355k
    public Object getValue() {
        Object obj = this.f8308b;
        E e8 = E.f8272a;
        if (obj != e8) {
            return obj;
        }
        Function0 function0 = this.f8307a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (androidx.concurrent.futures.a.a(f8306e, this, e8, invoke)) {
                this.f8307a = null;
                return invoke;
            }
        }
        return this.f8308b;
    }

    @Override // O5.InterfaceC1355k
    public boolean isInitialized() {
        if (this.f8308b != E.f8272a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
