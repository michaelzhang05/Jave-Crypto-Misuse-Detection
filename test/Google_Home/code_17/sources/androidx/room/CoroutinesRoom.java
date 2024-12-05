package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3374p;
import l6.C3377q0;
import l6.InterfaceC3390x0;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <R> InterfaceC3706f createFlow(RoomDatabase db, boolean z8, String[] tableNames, Callable<R> callable) {
            AbstractC3255y.i(db, "db");
            AbstractC3255y.i(tableNames, "tableNames");
            AbstractC3255y.i(callable, "callable");
            return AbstractC3708h.z(new CoroutinesRoom$Companion$createFlow$1(z8, db, tableNames, callable, null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, S5.d dVar) {
            S5.e transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return AbstractC3360i.g(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), dVar);
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, S5.d dVar) {
            S5.e transactionDispatcher;
            InterfaceC3390x0 d8;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            S5.e eVar = transactionDispatcher;
            C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
            c3374p.C();
            d8 = AbstractC3364k.d(C3377q0.f34651a, eVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c3374p, null), 2, null);
            c3374p.i(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, d8));
            Object y8 = c3374p.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }
    }

    private CoroutinesRoom() {
    }

    public static final <R> InterfaceC3706f createFlow(RoomDatabase roomDatabase, boolean z8, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z8, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, S5.d dVar) {
        return Companion.execute(roomDatabase, z8, cancellationSignal, callable, dVar);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, S5.d dVar) {
        return Companion.execute(roomDatabase, z8, callable, dVar);
    }
}
