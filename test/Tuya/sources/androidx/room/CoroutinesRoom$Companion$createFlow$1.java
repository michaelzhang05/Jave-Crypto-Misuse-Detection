package androidx.room;

import L5.I;
import androidx.room.InvalidationTracker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3359g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$createFlow$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {136}, m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
        final /* synthetic */ InterfaceC3359g $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03491 extends kotlin.coroutines.jvm.internal.l implements X5.n {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ k6.d $observerChannel;
            final /* synthetic */ k6.d $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03491(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, k6.d dVar, Callable<R> callable, k6.d dVar2, P5.d dVar3) {
                super(2, dVar3);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = dVar;
                this.$callable = callable;
                this.$resultChannel = dVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C03491(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C03491) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x003d, B:14:0x004b, B:16:0x0053, B:25:0x0025, B:27:0x0037), top: B:2:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r1 = r6.L$0
                    k6.f r1 = (k6.f) r1
                    L5.t.b(r7)     // Catch: java.lang.Throwable -> L17
                L15:
                    r7 = r1
                    goto L3d
                L17:
                    r7 = move-exception
                    goto L77
                L19:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L21:
                    java.lang.Object r1 = r6.L$0
                    k6.f r1 = (k6.f) r1
                    L5.t.b(r7)     // Catch: java.lang.Throwable -> L17
                    goto L4b
                L29:
                    L5.t.b(r7)
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r6.$observer
                    r7.addObserver(r1)
                    k6.d r7 = r6.$observerChannel     // Catch: java.lang.Throwable -> L17
                    k6.f r7 = r7.iterator()     // Catch: java.lang.Throwable -> L17
                L3d:
                    r6.L$0 = r7     // Catch: java.lang.Throwable -> L17
                    r6.label = r3     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r1 = r7.b(r6)     // Catch: java.lang.Throwable -> L17
                    if (r1 != r0) goto L48
                    return r0
                L48:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L4b:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
                    if (r7 == 0) goto L69
                    r1.next()     // Catch: java.lang.Throwable -> L17
                    java.util.concurrent.Callable<R> r7 = r6.$callable     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L17
                    k6.d r4 = r6.$resultChannel     // Catch: java.lang.Throwable -> L17
                    r6.L$0 = r1     // Catch: java.lang.Throwable -> L17
                    r6.label = r2     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r4.i(r7, r6)     // Catch: java.lang.Throwable -> L17
                    if (r7 != r0) goto L15
                    return r0
                L69:
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r0 = r6.$observer
                    r7.removeObserver(r0)
                    L5.I r7 = L5.I.f6487a
                    return r7
                L77:
                    androidx.room.RoomDatabase r0 = r6.$db
                    androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r6.$observer
                    r0.removeObserver(r1)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C03491.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z8, RoomDatabase roomDatabase, InterfaceC3359g interfaceC3359g, String[] strArr, Callable<R> callable, P5.d dVar) {
            super(2, dVar);
            this.$inTransaction = z8;
            this.$db = roomDatabase;
            this.$$this$flow = interfaceC3359g;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            P5.e queryDispatcher;
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                M m8 = (M) this.L$0;
                final k6.d b8 = k6.g.b(-1, null, null, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r72 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> tables) {
                        AbstractC3159y.i(tables, "tables");
                        b8.y(I.f6487a);
                    }
                };
                b8.y(I.f6487a);
                TransactionElement transactionElement = (TransactionElement) m8.getCoroutineContext().get(TransactionElement.Key);
                if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    if (this.$inTransaction) {
                        queryDispatcher = CoroutinesRoomKt.getTransactionDispatcher(this.$db);
                    } else {
                        queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$db);
                    }
                }
                k6.d b9 = k6.g.b(0, null, null, 7, null);
                AbstractC2829k.d(m8, queryDispatcher, null, new C03491(this.$db, r72, b8, this.$callable, b9, null), 2, null);
                InterfaceC3359g interfaceC3359g = this.$$this$flow;
                this.label = 1;
                if (AbstractC3360h.q(interfaceC3359g, b9, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z8, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, P5.d dVar) {
        super(2, dVar);
        this.$inTransaction = z8;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, dVar);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                L5.t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            L5.t.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, (InterfaceC3359g) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (N.e(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }

    @Override // X5.n
    public final Object invoke(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
    }
}
