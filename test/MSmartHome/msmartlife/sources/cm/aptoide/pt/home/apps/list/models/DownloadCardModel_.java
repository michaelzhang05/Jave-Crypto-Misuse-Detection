package cm.aptoide.pt.home.apps.list.models;

import cm.aptoide.pt.R;
import cm.aptoide.pt.home.apps.AppClick;
import cm.aptoide.pt.home.apps.list.models.DownloadCardModel;
import cm.aptoide.pt.home.apps.model.DownloadApp;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.u;
import com.airbnb.epoxy.v;

/* loaded from: classes.dex */
public class DownloadCardModel_ extends DownloadCardModel implements v<DownloadCardModel.CardHolder>, DownloadCardModelBuilder {
    private f0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private h0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private i0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private j0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    @Override // com.airbnb.epoxy.s
    public void addTo(n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    @Override // com.airbnb.epoxy.s
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadCardModel_) || !super.equals(obj)) {
            return false;
        }
        DownloadCardModel_ downloadCardModel_ = (DownloadCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? downloadCardModel_.getApplication() == null : getApplication().equals(downloadCardModel_.getApplication())) {
            return (getEventSubject() == null) == (downloadCardModel_.getEventSubject() == null);
        }
        return false;
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder eventSubject(rx.s.b bVar) {
        return eventSubject((rx.s.b<AppClick>) bVar);
    }

    @Override // com.airbnb.epoxy.s
    protected int getDefaultLayout() {
        return R.layout.apps_download_app_item;
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onBind(f0 f0Var) {
        return onBind((f0<DownloadCardModel_, DownloadCardModel.CardHolder>) f0Var);
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onUnbind(h0 h0Var) {
        return onUnbind((h0<DownloadCardModel_, DownloadCardModel.CardHolder>) h0Var);
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityChanged(i0 i0Var) {
        return onVisibilityChanged((i0<DownloadCardModel_, DownloadCardModel.CardHolder>) i0Var);
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityStateChanged(j0 j0Var) {
        return onVisibilityStateChanged((j0<DownloadCardModel_, DownloadCardModel.CardHolder>) j0Var);
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "DownloadCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ application(DownloadApp downloadApp) {
        onMutation();
        super.setApplication(downloadApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.t
    public DownloadCardModel.CardHolder createNewHolder() {
        return new DownloadCardModel.CardHolder();
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ eventSubject(rx.s.b<AppClick> bVar) {
        onMutation();
        super.setEventSubject(bVar);
        return this;
    }

    @Override // com.airbnb.epoxy.v
    public void handlePostBind(DownloadCardModel.CardHolder cardHolder, int i2) {
        f0<DownloadCardModel_, DownloadCardModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.v
    public void handlePreBind(u uVar, DownloadCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.s
    public DownloadCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onBind(f0<DownloadCardModel_, DownloadCardModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onUnbind(h0<DownloadCardModel_, DownloadCardModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public DownloadCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.setEventSubject(null);
        super.reset();
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public DownloadCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ spanSizeOverride(s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public void unbind(DownloadCardModel.CardHolder cardHolder) {
        super.unbind((DownloadCardModel_) cardHolder);
        h0<DownloadCardModel_, DownloadCardModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.a(this, cardHolder);
        }
    }

    public DownloadApp application() {
        return super.getApplication();
    }

    public rx.s.b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, DownloadCardModel.CardHolder cardHolder) {
        i0<DownloadCardModel_, DownloadCardModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public void onVisibilityStateChanged(int i2, DownloadCardModel.CardHolder cardHolder) {
        j0<DownloadCardModel_, DownloadCardModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.s
    public DownloadCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityChanged(i0<DownloadCardModel_, DownloadCardModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    @Override // cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityStateChanged(j0<DownloadCardModel_, DownloadCardModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(long j2) {
        super.id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(Number... numberArr) {
        super.id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(long j2, long j3) {
        super.id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(CharSequence charSequence) {
        super.id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ id(CharSequence charSequence, long j2) {
        super.id(charSequence, j2);
        return this;
    }
}
