package L5;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u implements InterfaceC1227k, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6514d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6515e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* renamed from: a, reason: collision with root package name */
    private volatile Function0 f6516a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f6517b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6518c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public u(Function0 initializer) {
        AbstractC3159y.i(initializer, "initializer");
        this.f6516a = initializer;
        E e8 = E.f6481a;
        this.f6517b = e8;
        this.f6518c = e8;
    }

    @Override // L5.InterfaceC1227k
    public Object getValue() {
        Object obj = this.f6517b;
        E e8 = E.f6481a;
        if (obj != e8) {
            return obj;
        }
        Function0 function0 = this.f6516a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (androidx.concurrent.futures.a.a(f6515e, this, e8, invoke)) {
                this.f6516a = null;
                return invoke;
            }
        }
        return this.f6517b;
    }

    @Override // L5.InterfaceC1227k
    public boolean isInitialized() {
        if (this.f6517b != E.f6481a) {
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
