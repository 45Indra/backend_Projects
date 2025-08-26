
# Password Generator Project

This project consists of a Python backend for generating passwords and a React (Vite) frontend for the user interface.

## How to Run

### Backend (Python)
Run the password generator backend using Python:

```
python password_generator.py
```

### Frontend (React)
Start the React frontend:

```
npm run dev
```

Then open the provided local URL in your browser.

## Integration
To connect the frontend and backend, you will need to expose the Python password generator as an API (e.g., using Flask or FastAPI) and call it from the React app. This is not yet implemented.

---

- Python backend: `password_generator.py`
- React frontend: Vite React app (in this folder)

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Babel](https://babeljs.io/) for Fast Refresh
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/) for Fast Refresh

## Expanding the ESLint configuration

If you are developing a production application, we recommend using TypeScript with type-aware lint rules enabled. Check out the [TS template](https://github.com/vitejs/vite/tree/main/packages/create-vite/template-react-ts) for information on how to integrate TypeScript and [`typescript-eslint`](https://typescript-eslint.io) in your project.
