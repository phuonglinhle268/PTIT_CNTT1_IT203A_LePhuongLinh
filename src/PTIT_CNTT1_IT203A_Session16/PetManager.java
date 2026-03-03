package PTIT_CNTT1_IT203A_Session16;

class PetManager extends Manager<Pet> {

    public void addPet(Pet pet) {
        list.add(pet);
        System.out.println("Them thu cung thanh cong");
    }

    public void showPets() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (Pet pet : list) {
            System.out.println(pet);
        }
    }

    public Pet findPetById(String id) {
        for (Pet pet : list) {
            if (pet.getId().equalsIgnoreCase(id)) {
                return pet;
            }
        }
        return null;
    }

    public boolean deletePetById(String id) {
        Pet pet = findPetById(id);
        if (pet != null) {
            list.remove(pet);
            return true;
        }
        return false;
    }
}