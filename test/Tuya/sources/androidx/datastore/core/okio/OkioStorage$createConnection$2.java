package androidx.datastore.core.okio;

import L5.I;
import P6.Q;
import androidx.datastore.core.okio.OkioStorage;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class OkioStorage$createConnection$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$createConnection$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5447invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5447invoke() {
        Q canonicalPath;
        OkioStorage.Companion companion = OkioStorage.Companion;
        Synchronizer activeFilesLock = companion.getActiveFilesLock();
        OkioStorage<T> okioStorage = this.this$0;
        synchronized (activeFilesLock) {
            Set<String> activeFiles$datastore_core_okio = companion.getActiveFiles$datastore_core_okio();
            canonicalPath = okioStorage.getCanonicalPath();
            activeFiles$datastore_core_okio.remove(canonicalPath.toString());
            I i8 = I.f6487a;
        }
    }
}
