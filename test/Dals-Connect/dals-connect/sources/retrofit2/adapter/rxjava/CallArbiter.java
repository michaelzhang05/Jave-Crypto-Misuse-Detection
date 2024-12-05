package retrofit2.adapter.rxjava;

import java.util.concurrent.atomic.AtomicInteger;
import retrofit2.Call;
import retrofit2.Response;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.a;
import rx.g;
import rx.j;
import rx.k;
import rx.q.f;

/* loaded from: classes2.dex */
final class CallArbiter<T> extends AtomicInteger implements k, g {
    private static final int STATE_HAS_RESPONSE = 2;
    private static final int STATE_REQUESTED = 1;
    private static final int STATE_TERMINATED = 3;
    private static final int STATE_WAITING = 0;
    private final Call<T> call;
    private volatile Response<T> response;
    private final j<? super Response<T>> subscriber;
    private volatile boolean unsubscribed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallArbiter(Call<T> call, j<? super Response<T>> jVar) {
        super(0);
        this.call = call;
        this.subscriber = jVar;
    }

    private void deliverResponse(Response<T> response) {
        try {
            if (!isUnsubscribed()) {
                this.subscriber.onNext(response);
            }
            try {
                if (isUnsubscribed()) {
                    return;
                }
                this.subscriber.onCompleted();
            } catch (OnCompletedFailedException e2) {
                e = e2;
                f.c().b().a(e);
            } catch (OnErrorFailedException e3) {
                e = e3;
                f.c().b().a(e);
            } catch (OnErrorNotImplementedException e4) {
                e = e4;
                f.c().b().a(e);
            } catch (Throwable th) {
                a.e(th);
                f.c().b().a(th);
            }
        } catch (OnCompletedFailedException e5) {
            e = e5;
            f.c().b().a(e);
        } catch (OnErrorFailedException e6) {
            e = e6;
            f.c().b().a(e);
        } catch (OnErrorNotImplementedException e7) {
            e = e7;
            f.c().b().a(e);
        } catch (Throwable th2) {
            a.e(th2);
            try {
                this.subscriber.onError(th2);
            } catch (OnCompletedFailedException e8) {
                e = e8;
                f.c().b().a(e);
            } catch (OnErrorFailedException e9) {
                e = e9;
                f.c().b().a(e);
            } catch (OnErrorNotImplementedException e10) {
                e = e10;
                f.c().b().a(e);
            } catch (Throwable th3) {
                a.e(th3);
                f.c().b().a(new CompositeException(th2, th3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void emitError(Throwable th) {
        set(3);
        if (isUnsubscribed()) {
            return;
        }
        try {
            this.subscriber.onError(th);
        } catch (OnCompletedFailedException e2) {
            e = e2;
            f.c().b().a(e);
        } catch (OnErrorFailedException e3) {
            e = e3;
            f.c().b().a(e);
        } catch (OnErrorNotImplementedException e4) {
            e = e4;
            f.c().b().a(e);
        } catch (Throwable th2) {
            a.e(th2);
            f.c().b().a(new CompositeException(th, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void emitResponse(Response<T> response) {
        while (true) {
            int i2 = get();
            if (i2 == 0) {
                this.response = response;
                if (compareAndSet(0, 2)) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("Unknown state: " + i2);
                    }
                    throw new AssertionError();
                }
                if (compareAndSet(1, 3)) {
                    deliverResponse(response);
                    return;
                }
            }
        }
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.unsubscribed;
    }

    @Override // rx.g
    public void request(long j2) {
        if (j2 == 0) {
            return;
        }
        while (true) {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 1) {
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return;
                    }
                    throw new IllegalStateException("Unknown state: " + i2);
                }
                if (compareAndSet(2, 3)) {
                    deliverResponse(this.response);
                    return;
                }
            } else if (compareAndSet(0, 1)) {
                return;
            }
        }
    }

    @Override // rx.k
    public void unsubscribe() {
        this.unsubscribed = true;
        this.call.cancel();
    }
}
