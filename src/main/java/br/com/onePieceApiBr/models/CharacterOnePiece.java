
package br.com.onePieceApiBr.models;

public class CharacterOnePiece {

    private String name;

    private String role;

    private String description;

    private Long id;

    public CharacterOnePiece(Long id, String name, String role, String description) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.description = description;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}