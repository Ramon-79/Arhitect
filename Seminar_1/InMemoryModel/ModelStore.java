
import java.util.ArrayList;

public class ModelStore implements IModelChangeObserver, IModelChanger {

  ArrayList<PoligonalModel> Models = new ArrayList<>();
  ArrayList<Scene> Scenes = new ArrayList<>();
  ArrayList<Flash> Flashes = new ArrayList<>();
  ArrayList<Camera> Cameras = new ArrayList<>();

  public Scene getScene(int n_scene) {

    return Scenes.get(n_scene);
  }

  @Override
  public void NotifyChange() {
    // stub

  }

  @Override
  public void ApplyUpdateModel() {
    // stub

  }
}
