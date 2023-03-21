describe('Navigate to User Overview', () => {
    it('Navigate to /unauthorized', () => {

        // visit the login page
        cy.visit('http://stefan.dev.noseryoung.ch/login')

        // log in with normal user to the application
        cy.get('#email')
            .type('user@example.com')
        cy.get('#password')
            .type('1234')
        cy.get('form').submit()
            cy.wait(500)


        cy.get("#image")
            .type("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Stephan%27s_Quintet_taken_by_James_Webb_Space_Telescope.jpg/220px-Stephan%27s_Quintet_taken_by_James_Webb_Space_Telescope.jpg")
        cy.get("#description")
            .type("Die Galaxien NGC 7317 bis NGC 7319 bilden ein räumlich enges, wechselwirkendes System.")


        for (let i = 0; i < 300; i++) {
            cy.get("form").submit()
        }

    })
})