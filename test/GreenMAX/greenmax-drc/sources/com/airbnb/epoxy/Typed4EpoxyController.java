package com.airbnb.epoxy;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class Typed4EpoxyController<T, U, V, W> extends n {
    private boolean allowModelBuildRequests;
    private T data1;
    private U data2;
    private V data3;
    private W data4;

    public Typed4EpoxyController() {
    }

    @Override // com.airbnb.epoxy.n
    protected final void buildModels() {
        if (isBuildingModels()) {
            buildModels(this.data1, this.data2, this.data3, this.data4);
            return;
        }
        throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    protected abstract void buildModels(T t, U u, V v, W w);

    @Override // com.airbnb.epoxy.n
    public void moveModel(int i2, int i3) {
        this.allowModelBuildRequests = true;
        super.moveModel(i2, i3);
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.n
    public void requestDelayedModelBuild(int i2) {
        if (this.allowModelBuildRequests) {
            super.requestDelayedModelBuild(i2);
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    @Override // com.airbnb.epoxy.n
    public final void requestModelBuild() {
        if (this.allowModelBuildRequests) {
            super.requestModelBuild();
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    public void setData(T t, U u, V v, W w) {
        this.data1 = t;
        this.data2 = u;
        this.data3 = v;
        this.data4 = w;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    public Typed4EpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }
}
