package androidx.lifecycle;

/* loaded from: classes3.dex */
public interface LiveDataScope<T> {
    Object emit(T t8, P5.d dVar);

    Object emitSource(LiveData<T> liveData, P5.d dVar);

    T getLatestValue();
}
