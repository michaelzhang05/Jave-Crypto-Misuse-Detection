package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2839p;
import i6.C2842q0;
import i6.InterfaceC2855x0;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <R> InterfaceC3358f createFlow(RoomDatabase db, boolean z8, String[] tableNames, Callable<R> callable) {
            AbstractC3159y.i(db, "db");
            AbstractC3159y.i(tableNames, "tableNames");
            AbstractC3159y.i(callable, "callable");
            return AbstractC3360h.x(new CoroutinesRoom$Companion$createFlow$1(z8, db, tableNames, callable, null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, P5.d dVar) {
            P5.e transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return AbstractC2825i.g(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), dVar);
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, P5.d dVar) {
            P5.e transactionDispatcher;
            InterfaceC2855x0 d8;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            P5.e eVar = transactionDispatcher;
            C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
            c2839p.B();
            d8 = AbstractC2829k.d(C2842q0.f31799a, eVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c2839p, null), 2, null);
            c2839p.j(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, d8));
            Object y8 = c2839p.y();
            if (y8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }
    }

    private CoroutinesRoom() {
    }

    public static final <R> InterfaceC3358f createFlow(RoomDatabase roomDatabase, boolean z8, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z8, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, P5.d dVar) {
        return Companion.execute(roomDatabase, z8, cancellationSignal, callable, dVar);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, P5.d dVar) {
        return Companion.execute(roomDatabase, z8, callable, dVar);
    }
}
