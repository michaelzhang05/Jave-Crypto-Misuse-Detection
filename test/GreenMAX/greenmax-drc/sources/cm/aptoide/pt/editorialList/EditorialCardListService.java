package cm.aptoide.pt.editorialList;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.DataList;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.dataprovider.ws.v7.EditorialListData;
import cm.aptoide.pt.dataprovider.ws.v7.EditorialListRequest;
import cm.aptoide.pt.dataprovider.ws.v7.EditorialListResponse;
import cm.aptoide.pt.editorialList.EditorialCardListModel;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import rx.Single;

/* loaded from: classes.dex */
public class EditorialCardListService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private final int limit;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public EditorialCardListService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, int i2) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.limit = i2;
    }

    private List<CurationCard> buildCurationCardList(List<EditorialListData> list) {
        ArrayList arrayList = new ArrayList();
        for (EditorialListData editorialListData : list) {
            arrayList.add(new CurationCard(editorialListData.getId(), editorialListData.getCaption(), editorialListData.getIcon(), editorialListData.getTitle(), editorialListData.getViews(), editorialListData.getType(), editorialListData.getDate(), editorialListData.getAppearance() != null ? editorialListData.getAppearance().getCaption().getTheme() : HttpUrl.FRAGMENT_ENCODE_SET, editorialListData.getFlair() != null ? editorialListData.getFlair() : HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardList(EditorialListResponse editorialListResponse) {
        DataList<EditorialListData> dataList = editorialListResponse.getDataList();
        return new EditorialCardListModel(buildCurationCardList(dataList.getList()), dataList.getNext(), dataList.getTotal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardListError(Throwable th) {
        if (!(th instanceof NoNetworkConnectionException) && !(th instanceof ConnectException)) {
            return new EditorialCardListModel(EditorialCardListModel.Error.GENERIC);
        }
        return new EditorialCardListModel(EditorialCardListModel.Error.NETWORK);
    }

    public Single<EditorialCardListModel> loadEditorialCardListModel(int i2, boolean z) {
        if (this.loading) {
            return Single.m(new EditorialCardListModel(true));
        }
        return EditorialListRequest.of(this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.limit, i2).observe(z, false).y(new rx.m.a() { // from class: cm.aptoide.pt.editorialList.c
            @Override // rx.m.a
            public final void call() {
                EditorialCardListService.this.c();
            }
        }).A(new rx.m.a() { // from class: cm.aptoide.pt.editorialList.e
            @Override // rx.m.a
            public final void call() {
                EditorialCardListService.this.d();
            }
        }).z(new rx.m.a() { // from class: cm.aptoide.pt.editorialList.g
            @Override // rx.m.a
            public final void call() {
                EditorialCardListService.this.e();
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.editorialList.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                EditorialCardListModel mapEditorialCardList;
                mapEditorialCardList = EditorialCardListService.this.mapEditorialCardList((EditorialListResponse) obj);
                return mapEditorialCardList;
            }
        }).Z0().r(new rx.m.e() { // from class: cm.aptoide.pt.editorialList.d
            @Override // rx.m.e
            public final Object call(Object obj) {
                EditorialCardListModel mapEditorialCardListError;
                mapEditorialCardListError = EditorialCardListService.this.mapEditorialCardListError((Throwable) obj);
                return mapEditorialCardListError;
            }
        });
    }
}
