package cm.aptoide.pt.editorial;

import android.content.SharedPreferences;
import cm.aptoide.pt.aab.SplitsMapper;
import cm.aptoide.pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.EditorialCard;
import cm.aptoide.pt.dataprovider.model.v7.listapp.App;
import cm.aptoide.pt.dataprovider.model.v7.listapp.File;
import cm.aptoide.pt.dataprovider.model.v7.store.Store;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.editorial.EditorialViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import rx.Single;

/* loaded from: classes.dex */
public class EditorialService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private CampaignMapper campaignMapper;
    private final Converter.Factory converterFactory;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final TokenInvalidator tokenInvalidator;

    public EditorialService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, CampaignMapper campaignMapper) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.splitsMapper = splitsMapper;
        this.campaignMapper = campaignMapper;
    }

    private EditorialContent buildEditorialContent(EditorialCard.Content content, List<EditorialMedia> list, App app, EditorialCard.Action action, int i2) {
        if (action != null && app != null) {
            Store store = app.getStore();
            File file = app.getFile();
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store.getId(), store.getName(), file.getVername(), file.getVercode(), file.getPath(), file.getPathAlt(), file.getMd5sum(), action.getTitle(), action.getUrl(), i2, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString(), app.getAppcoins().getFlags(), this.campaignMapper.mapCampaign(app.getUrls()));
        }
        if (app != null) {
            Store store2 = app.getStore();
            File file2 = app.getFile();
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store2.getId(), store2.getName(), file2.getVername(), file2.getVercode(), file2.getPath(), file2.getPathAlt(), file2.getMd5sum(), i2, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString(), app.getAppcoins().getFlags(), this.campaignMapper.mapCampaign(app.getUrls()));
        }
        if (action != null) {
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), action.getTitle(), action.getUrl(), i2);
        }
        return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), i2);
    }

    private EditorialViewModel buildEditorialViewModel(List<EditorialContent> list, EditorialCard.Data data, List<Integer> list2, List<EditorialContent> list3, EditorialContent editorialContent, String str, String str2) {
        String theme = data.getAppearance() != null ? data.getAppearance().getCaption().getTheme() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (editorialContent != null) {
            return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, editorialContent.getAppName(), editorialContent.getIcon(), editorialContent.getId(), editorialContent.getPackageName(), editorialContent.getMd5sum(), editorialContent.getVerCode(), editorialContent.getVerName(), editorialContent.getPath(), editorialContent.getPathAlt(), editorialContent.getObb(), true, str, str2, editorialContent.getSize(), theme, editorialContent.getSplits(), editorialContent.getRequiredSplits(), editorialContent.hasAppc(), editorialContent.getRank(), editorialContent.getStoreName(), editorialContent.getBdsFlags(), editorialContent.getCampaign());
        }
        return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, false, str, str2, theme);
    }

    private List<EditorialMedia> buildMediaList(List<EditorialCard.Media> list) {
        EditorialMedia editorialMedia;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EditorialCard.Media media : list) {
                if (media.getUrl() != null) {
                    editorialMedia = new EditorialMedia(media.getType(), media.getDescription(), media.getThumbnail(), media.getUrl());
                } else {
                    editorialMedia = new EditorialMedia(media.getType(), media.getDescription(), media.getThumbnail(), media.getImage());
                }
                arrayList.add(editorialMedia);
            }
        }
        return arrayList;
    }

    private List<EditorialContent> buildPlaceHolderContent(List<EditorialContent> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createErrorEditorialModel, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EditorialViewModel j(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new EditorialViewModel(EditorialViewModel.Error.NETWORK);
        }
        return new EditorialViewModel(EditorialViewModel.Error.GENERIC);
    }

    private List<Integer> getPlaceHolderPositions(List<EditorialContent> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).isPlaceHolderType()) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e i(EditorialCard editorialCard) {
        return lambda$loadEditorialViewModel$3(editorialCard, editorialCard.getData().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapEditorial, reason: merged with bridge method [inline-methods] */
    public rx.e<EditorialViewModel> d(EditorialCard editorialCard, String str) {
        if (editorialCard.isOk()) {
            EditorialCard.Data data = editorialCard.getData();
            List<EditorialContent> mapEditorialContent = mapEditorialContent(data.getContent());
            List<Integer> placeHolderPositions = getPlaceHolderPositions(mapEditorialContent);
            List<EditorialContent> buildPlaceHolderContent = buildPlaceHolderContent(mapEditorialContent, placeHolderPositions);
            EditorialContent editorialContent = null;
            if (!buildPlaceHolderContent.isEmpty() && buildPlaceHolderContent.size() == 1) {
                editorialContent = buildPlaceHolderContent.get(0);
            }
            return rx.e.S(buildEditorialViewModel(mapEditorialContent, data, placeHolderPositions, buildPlaceHolderContent, editorialContent, str, data.getType()));
        }
        return rx.e.C(new IllegalStateException("Could not obtain request from server."));
    }

    private List<EditorialContent> mapEditorialContent(List<EditorialCard.Content> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                EditorialCard.Content content = list.get(i2);
                arrayList.add(buildEditorialContent(content, buildMediaList(content.getMedia()), content.getApp(), content.getAction(), i2));
            }
        }
        return arrayList;
    }

    public Single<EditorialViewModel> loadEditorialViewModel(final String str) {
        if (this.loading) {
            return Single.m(new EditorialViewModel(true));
        }
        return EditorialRequest.ofWithCardId(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().y(new rx.m.a() { // from class: cm.aptoide.pt.editorial.c6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.a();
            }
        }).A(new rx.m.a() { // from class: cm.aptoide.pt.editorial.i6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.b();
            }
        }).z(new rx.m.a() { // from class: cm.aptoide.pt.editorial.d6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.c();
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.k6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialService.this.d(str, (EditorialCard) obj);
            }
        }).Z0().r(new rx.m.e() { // from class: cm.aptoide.pt.editorial.j6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialService.this.e((Throwable) obj);
            }
        });
    }

    public Single<EditorialViewModel> loadEditorialViewModelWithSlug(String str) {
        if (this.loading) {
            return Single.m(new EditorialViewModel(true));
        }
        return EditorialRequest.ofWithSlug(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().y(new rx.m.a() { // from class: cm.aptoide.pt.editorial.g6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.f();
            }
        }).A(new rx.m.a() { // from class: cm.aptoide.pt.editorial.h6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.g();
            }
        }).z(new rx.m.a() { // from class: cm.aptoide.pt.editorial.e6
            @Override // rx.m.a
            public final void call() {
                EditorialService.this.h();
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.l6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialService.this.i((EditorialCard) obj);
            }
        }).Z0().r(new rx.m.e() { // from class: cm.aptoide.pt.editorial.f6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialService.this.j((Throwable) obj);
            }
        });
    }
}
