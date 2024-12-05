package cm.aptoide.pt.editorialList;

import java.util.ArrayList;
import java.util.List;
import rx.Single;

/* loaded from: classes.dex */
public class EditorialCardListRepository {
    private EditorialCardListModel cachedEditorialCardListModel;
    private final EditorialCardListService editorialCardListService;

    public EditorialCardListRepository(EditorialCardListService editorialCardListService) {
        this.editorialCardListService = editorialCardListService;
    }

    private EditorialCardListModel cloneList(EditorialCardListModel editorialCardListModel) {
        return (editorialCardListModel.hasError() || editorialCardListModel.isLoading()) ? editorialCardListModel : new EditorialCardListModel(new ArrayList(editorialCardListModel.getCurationCards()), editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNewEditorialCardListModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ EditorialCardListModel a(boolean z, EditorialCardListModel editorialCardListModel) {
        if (!editorialCardListModel.hasError() && !editorialCardListModel.isLoading()) {
            updateCache(editorialCardListModel, z);
        }
        return cloneList(editorialCardListModel);
    }

    private Single<EditorialCardListModel> loadNewEditorialCardListModel(int i2, final boolean z, boolean z2) {
        return this.editorialCardListService.loadEditorialCardListModel(i2, z2).n(new rx.m.e() { // from class: cm.aptoide.pt.editorialList.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialCardListRepository.this.a(z, (EditorialCardListModel) obj);
            }
        });
    }

    private void updateCache(EditorialCardListModel editorialCardListModel, boolean z) {
        if (!z) {
            this.cachedEditorialCardListModel = editorialCardListModel;
            return;
        }
        List<CurationCard> curationCards = this.cachedEditorialCardListModel.getCurationCards();
        curationCards.addAll(editorialCardListModel.getCurationCards());
        this.cachedEditorialCardListModel = new EditorialCardListModel(curationCards, editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }

    public boolean hasMore() {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        return editorialCardListModel != null && editorialCardListModel.getOffset() < this.cachedEditorialCardListModel.getTotal();
    }

    public Single<EditorialCardListModel> loadEditorialCardListModel(boolean z) {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        if (editorialCardListModel != null && !z) {
            return Single.m(cloneList(editorialCardListModel));
        }
        return loadNewEditorialCardListModel(0, false, z);
    }

    public Single<EditorialCardListModel> loadMoreCurationCards() {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        return loadNewEditorialCardListModel(editorialCardListModel != null ? editorialCardListModel.getOffset() : 0, true, false);
    }

    public void updateCache(EditorialCardListModel editorialCardListModel, List<CurationCard> list) {
        this.cachedEditorialCardListModel = new EditorialCardListModel(list, editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }
}
