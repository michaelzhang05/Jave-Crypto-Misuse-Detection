package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.this$0 = multiInstanceInvalidationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInvalidation$lambda$0(MultiInstanceInvalidationClient this$0, String[] tables) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(tables, "$tables");
        this$0.getInvalidationTracker().notifyObserversByTableNames((String[]) Arrays.copyOf(tables, tables.length));
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(final String[] tables) {
        AbstractC3159y.i(tables, "tables");
        Executor executor = this.this$0.getExecutor();
        final MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.room.f
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0(MultiInstanceInvalidationClient.this, tables);
            }
        });
    }
}
